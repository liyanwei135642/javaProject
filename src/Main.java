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
 * HTTP��Ϣ��ʽ��
 * HTTP����
 *      1.�����У�
 *          ����ʽ ����URL ����Э��
 *          GET http://localhost/ HTTP/1.1
 *      2.����ͷ��
 *          ����ͷ����: ����ͷֵ
 *      3.������У�
 *          ����
 *      4.�����壺(���ģ�
 *
 *      �ַ�����ʽ���£�
 *      POST http://localhost/ HTTP/1.1
 *      Host: localhost
 *      User-Agent: Mozilla/5.0 Chrome/113.0.0.0 Safari/537.36(���߷������ҵ����������)
 *      Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng;q=0.8,application/signed-exchange;v=b3;q=0.7
 *      Accept-Language: gzip, deflate, br
 *      Accept-Encoding: zh-CN,zh;q=0.9
 *      Referer: http://localhost/login.html(��ֹ�����Ӹ��߷��������Ǵ��ĸ���ҳ����)
 *      Connection: keep-alive
 *      Upgrade-Insecure-Requests:1
 *
 *      ͨ��get....()��ȡ�������Ϣ
 *
*
*
*           post���� ��ȡ������
*           BufferedReader br=req.getReader();
* //        char[] arr=new char[1024];
* //        int n=0;
* //        while((n=br.read(arr))!=-1)
* //        {
* //            System.out.println(new String(arr,0,n));
* //        }
 *
 *          ����ת�� ����ǰת��������servlet url �ӿ�ʵ����
 * *        req.getRequestDispatcher("/test2").forward(req,resp);
 *
 *
 *          ��������������
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