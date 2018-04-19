import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class downloadTest extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //ͨ��·���õ�һ��������
        String path =     this.getServletContext().getRealPath("/WEB-INF/w.txt");
        FileInputStream fis =  new FileInputStream(path);
        //�����ֽ������
        ServletOutputStream sos  = response.getOutputStream();
        
        //�õ�Ҫ���ص�ͼƬ�ļ���
        String filename = path.substring(path.lastIndexOf("\\"+ "w"));
            
        
        //���߿ͻ�����Ҫ����ͼƬ��ͨ����Ӧ��Ϣͷ��
        response.setHeader("content-disposition", "attachment;filename="+filename);
        
        //���߿ͻ��������ļ�������
        response.setHeader("content-type", "txt");
        
        //ִ���������
        int len = 1;
        byte[] b = new byte[1024];
        while((len=fis.read(b)) != -1){
            sos.write(b,0,len);
        }
        sos.close();
        fis.close();
        
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

}
