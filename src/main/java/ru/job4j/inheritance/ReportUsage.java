package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport testReport = new JSONReport();

        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        String testText = testReport.generate("имя", "тело");
        System.out.println(testText);
    }
}
