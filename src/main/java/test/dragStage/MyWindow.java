package test.dragStage;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class MyWindow extends Stage
{
    StackPane root = new StackPane(); //根节点
    Scene scene = new Scene(root);

    public MyWindow(Window owner)
    {
        // 给根节点添加一个背景色以方便辩认
        root.setStyle("-fx-background-color: #333");
        initLayout();
        initDragSupport(); // 拖拽支持

        // 指定父窗口
        initOwner(owner);

        // 指定是否标准窗口（标准窗口有标题栏和边框)
        initStyle(StageStyle.UNDECORATED); // 默认为 DECORATED

        // 指定Scene
        setScene(scene);

        // 调整窗口适应Scene大小
        sizeToScene();
    }

    // 添加一个关闭按钮
    private void initLayout()
    {
        Button button = new Button("关闭");
        root.getChildren().add(button);
        StackPane.setAlignment(button, Pos.CENTER);

        button.setOnAction( (e)->{
            close();
        });
    }

    // 改变窗口大小
    public void resize(double w, double h)
    {
        // 第一种方法：指定根容器的大小, 让窗口适应根容器
        root.setPrefWidth( w);
        root.setPrefHeight( h);
        this.sizeToScene();

        // 第二种方法：指定窗口的整体尺寸（包含标题栏）
        // 但是，当设置为 UNDECORATED 时，此方法失效
//		this.setWidth(w);
//		this.setHeight(h);
    }

    // 指定窗口位置
    public void relocate(double x, double y)
    {
        this.setX(x);
        this.setY(y);
    }

    // 相对于父窗口中心显示
    public void centerInParent()
    {
        Window owner = this.getOwner();
        if(owner != null)
        {
            // 父窗口的位置px, py, 大小 pw, ph
            double px = owner.getX(), py = owner.getY();
            double pw = owner.getWidth(), ph = owner.getHeight();

            double dx = (pw - getWidth())/2;
            double dy = (ph - getHeight())/2;

            this.setX( px + dx);
            this.setY( py + dy);
        }
    }


    ////////////// 拖动支持 ///////////////
    private Stage stage; // 窗口

    private boolean dragging = false;
    private boolean resizingH = false; // 水平方向可改变大小
    private boolean resizingV = false; // 竖直方向可改变大小
    private boolean moving = false; // 移动窗口位置

    private double windowX = 0, windowY = 0; // 初始窗口坐标
    private double windowW = 0, windowH = 0; // 初始窗口大小
    private double startX, startY;  // 鼠标按下位置的相对坐标
    private double startScreenX, startScreenY;  // 鼠标相对屏幕Screen坐标


    private void initDragSupport()
    {
        stage = MyWindow.this;

        root.setOnMouseMoved( (e)->{

            boolean rh = isResizingH(e.getX());
            boolean rv = isResizingV(e.getY());
            if( rh && rv)
                root.setCursor(Cursor.SE_RESIZE); // 水平 & 竖直
            else if(rh)
                root.setCursor(Cursor.H_RESIZE);  // 仅水平改变大小
            else if(rv)
                root.setCursor(Cursor.V_RESIZE);  // 仅竖直改变大小
            else
                root.setCursor(Cursor.DEFAULT);
        });

        root.setOnMousePressed((MouseEvent e)->{

            // 记录鼠标点下时，窗口的坐标、大小
            windowX = stage.getX();
            windowY = stage.getY();
            windowW = stage.getWidth();
            windowH = stage.getHeight();

            // 记录鼠标点下时，鼠标的位置
            startX = e.getX();
            startY = e.getY();
            startScreenX = e.getScreenX();
            startScreenY = e.getScreenY();
        });

        root.setOnDragDetected((MouseEvent e)->{
            if(e.getButton() == MouseButton.PRIMARY)
            {
                dragging = true;

                // 判断是移动、还是改变大小
                resizingH = isResizingH( startX );
                resizingV = isResizingV( startY );
                if(! resizingH && !resizingV)
                    moving=true;
            }
        });

        root.setOnMouseDragged((MouseEvent e)->{
            if(!dragging) return;

            // 计算鼠标的位移 , 起始点A点，当前位置 B点
            double dx = e.getScreenX() - startScreenX;
            double dy = e.getScreenY() - startScreenY;

            // 移动窗口位置
            if(moving)
            {
                stage.setX ( windowX + dx);
                stage.setY ( windowY + dy);
                //System.out.println("moving...");
            }

            // 改变窗口大小
            if(resizingH || resizingV)
            {
                double newW = windowW + dx;
                double newH = windowH + dy;
                //System.out.println("change size to: " + newW + "," + newH);
                if(resizingH) root.setPrefWidth(newW);
                if(resizingV) root.setPrefHeight(newH);
                //AfStyleWindow.this.setWidth(newW);
                //AfStyleWindow.this.setWidth(newH);
                stage.sizeToScene();
            }
        });

        root.setOnMouseReleased((MouseEvent e)->{
            dragging = false;
            moving = false;
            resizingH = resizingV = false;
        });
    }

    // 判断鼠标位置是否在边框上
    public boolean isResizingH (double x)
    {
        double w = root.getWidth();
        return x >= w-4 && x < w;
    }

    public boolean isResizingV ( double y)
    {
        double h = root.getHeight();
        return y >= h-4 && y < h;
    }
}

