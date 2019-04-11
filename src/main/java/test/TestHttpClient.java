package test;

import com.google.gson.Gson;
import entity.SingerListContains;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestHttpClient {

    private String url = "http://m.kugou.com/singer/info/3060&json=true&page=2";

    public void testRequestHeader() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        //追加request headers 设置成手机浏览器
        get.addHeader("User-Agent", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 5_1_1 like Mac OS X; en) AppleWebKit/534.46.0 (KHTML, like Gecko) CriOS/19.0.1084.60 Mobile/9B206 Safari/7534.48.3");
        CloseableHttpResponse httpResponse = httpClient.execute(get);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        System.out.println("状态码： " + statusCode);
        if (statusCode == 200) {
            String responseMsg = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            Gson gson = new Gson();
            SingerListContains singerListContains = gson.fromJson(responseMsg, SingerListContains.class);
            System.out.println(singerListContains.toString());
            System.out.println(responseMsg);

            httpResponse.close();
            httpClient.close();
        }
    }

    @Test
    public void test() throws IOException {
        testRequestHeader();
    }
}
