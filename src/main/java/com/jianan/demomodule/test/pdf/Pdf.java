package com.jianan.demomodule.test.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.jianan.demomodule.test.json.Param;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jn
 * @Date: 2024/4/3
 * @description
 **/
public class Pdf {
    @Test
    public void readText() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("测试文档.pdf");
        PdfReader reader = new PdfReader(inputStream);
        int pages = reader.getNumberOfPages();
        if(pages > 0){
            for(int i = 1; i <= pages; i++){
                String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
                //System.out.println(textFromPage);
            }
        }
        
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        parser.processContent(1,new TextRenderListener());
    }

    public static void main(String[] args) {
        
        // URL resource = this.getClass().getResource();
        Double a = null;
        System.out.println(a == 0);


        List<Param> list = new ArrayList<>();
        // print size
        System.out.println(list.size());
        // list增加10个元素
        
        
        
        
        
        Param param = new Param();
        // 默认值
        
        
        

    }
}
