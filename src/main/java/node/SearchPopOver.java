package node;

import org.controlsfx.control.PopOver;

public class SearchPopOver {

    private static PopOver popOver = null;
    private static boolean isPopOverInited = false;
    public static PopOver getPopOver() {
        if (popOver == null)
            popOver = new PopOver();
        if (!isPopOverInited) {
            popOver.setArrowSize(0);
            isPopOverInited = true;
            popOver.setPrefWidth(260d);
            popOver.animatedProperty().setValue(true);
        }
        return popOver;
    }//
}
