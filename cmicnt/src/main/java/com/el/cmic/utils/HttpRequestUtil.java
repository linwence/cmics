package com.el.cmic.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@Component
@Scope("prototype")
public class HttpRequestUtil {
    //@Value("${nt.Url}")
   // private String url;

    /**
     * 向指定 URL 发送Http POST方法的请求
     * * @param param map
     * 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     *
     * @return 所代表远程资源的响应结果
     */
    public String sendPost(String url,Map<String, String> param) throws Exception {

        HttpURLConnection connection = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";//返回字符串
        String sendStr = "";//发送参数
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = (HttpURLConnection) realUrl.openConnection();


            // 设置通用的请求属性
            connection = (HttpURLConnection) conn;

            connection.setRequestMethod("POST");//设置为post请求
            connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=--testsssssss");//设置发送的实体类型
            connection.setRequestProperty("accept", "*/*");//预期接收类型
            connection.setRequestProperty("connection", "Keep-Alive");//持续连接
            //connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行 （发送请求参数 和接收参数）
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);//post请求不能缓存

            //建立连接
            connection.connect();


            //拼接参数
            for (Map.Entry<String, String> entity : param.entrySet()) {
                sendStr += entity.getKey() + "=" + entity.getValue() + "&";
            }

            System.out.println(sendStr);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(sendStr);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

}
