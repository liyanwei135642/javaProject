// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}


/**
 * HTTP消息格式：
 * HTTP请求：
 *      1.请求行：
 *          请求方式 请求URL 请求协议
 *          GET http://localhost/ HTTP/1.1
 *      2.请求头：
 *          请求头名称: 请求头值
 *      3.请求空行：
 *          空行
 *      4.请求体：(正文）
 *
 *      字符串格式如下：
 *      POST http://localhost/ HTTP/1.1
 *      Host: localhost
 *      User-Agent: Mozilla/5.0 Chrome/113.0.0.0 Safari/537.36(告诉服务器我的浏览器类型)
 *      Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng;q=0.8,application/signed-exchange;v=b3;q=0.7
 *      Accept-Language: gzip, deflate, br
 *      Accept-Encoding: zh-CN,zh;q=0.9
 *      Referer: http://localhost/login.html(防止盗链接告诉服务器我是从哪个网页来的)
 *      Connection: keep-alive
 *      Upgrade-Insecure-Requests:1
 *
 *      通过get....()获取请求的信息
 *
*
*
*           post请求 获取请求体
*           BufferedReader br=req.getReader();
* //        char[] arr=new char[1024];
* //        int n=0;
* //        while((n=br.read(arr))!=-1)
* //        {
* //            System.out.println(new String(arr,0,n));
* //        }
 *
 *          请求转发 将当前转发给其他servlet url 接口实现类
 * *        req.getRequestDispatcher("/test2").forward(req,resp);
 *
 *
 *          中文乱码解决方案
* //        req.setCharacterEncoding("utf8");
 *
 *
* //        Map<String,String[]> map=req.getParameterMap();
* //        System.out.println(req.getParameter("username"));
* //        String[] arr=req.getParameterValues("username");
* //        System.out.println(Arrays.toString(arr));
* //        System.out.println(Arrays.toString(map.get("username")));
 *
 *
 *
 *
 *
 */