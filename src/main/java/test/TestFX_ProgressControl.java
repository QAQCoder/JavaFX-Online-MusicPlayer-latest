package test;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * 计算斐波那契数列，然后显示在进度条
 */
public class TestFX_ProgressControl implements Initializable {

    public Button btnStart;
    public Button btnStop;
    public ProgressIndicator pi;
    public ProgressBar pb;
    public TextField tfFibNum;
    public TextField tfFibRes;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
    }

    private void initView() {
        tfFibNum.setText("50");
    }

    private void initEvent() {
        btnStart.setOnAction(ae -> {
            initProgress();

            pb.progressProperty().bind(service.progressProperty());
            pi.progressProperty().bind(service.progressProperty());

            service.restart();

            service.setOnSucceeded(event -> {
                tfFibRes.setText(String.valueOf(event.getSource().getValue()));
                pb.setProgress(100);
                pi.setProgress(100);
            });
        });

        btnStop.setOnAction(ae -> {
            service.cancel();
        });
    }

    private void initProgress() {
        pb.setProgress(0);
        pi.setProgress(0);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }//

    Service<Integer> service = new Service<Integer>() {
        @Override
        protected Task<Integer> createTask() {
            return new Task<Integer>() {
                @Override
                protected Integer call() {
                    return fib(Integer.parseInt(tfFibNum.getText()));
                }
            };
        }
    };
}
