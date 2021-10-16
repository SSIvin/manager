package PrintHtmlToPdf;

import com.itextpdf.html2pdf.HtmlConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Dto.ReportDataDto;
import smev.Service.ReportService;
import smev.SmevApplication;

import java.io.*;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class htmlToPdf {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private ReportService reportService;


    @Test
    public void getPdf() throws IOException {

        ReportDataDto reportDataDto = new ReportDataDto();
            reportDataDto.setInteractionId(UUID.fromString("a62c7a23-bf57-490f-b3b8-03828e9fa87b"));
            reportDataDto.setXsltForm("TemplateZagsRogdenie2.xsl");

        final File outputFile = new File("C:\\01\\", "testPDF.pdf");
        FileOutputStream stream = new FileOutputStream(outputFile);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String s = this.reportService.CreateReport(reportDataDto);
        HtmlConverter.convertToPdf(s,stream);

    }



    @Test
    public void stringToPdf() {

//        final File outputFile = File.createTempFile("C:\\01\\", "testPDF.pdf");
//        FileOutputStream os = null;
//
//            os = new FileOutputStream(outputFile);
//
//            ITextRenderer renderer = new ITextRenderer();
//            ReportDataDto reportDataDto = new ReportDataDto();
//            reportDataDto.setInteractionId(UUID.fromString("a62c7a23-bf57-490f-b3b8-03828e9fa87b"));
//            reportDataDto.setXsltForm("TemplateZagsRogdenie2.xsl");
//
//
//            String s = this.reportService.CreateReport(reportDataDto);
////            String processedHtml = templateEngine.process(templateName, ctx);
//
//            renderer.setDocumentFromString(s);
//            renderer.layout();
//            renderer.createPDF(os, false);
//            renderer.finishPDF();
//            System.out.println("PDF created successfully");

    }




}
