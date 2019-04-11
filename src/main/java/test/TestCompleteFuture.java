package test;

import net.SurfTheNet;

import java.util.concurrent.CompletableFuture;

public class TestCompleteFuture {

    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> {
            new TestCompleteFuture().visitNet();
        }).whenComplete((aVoid, throwable) -> {
            if (throwable != null)
                System.out.println(throwable.getMessage());
        });
    }

    private void visitNet() {
        SurfTheNet.getSearchMusicHash("林俊杰", 1,2);
    }
}
