package latihangrafik;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Latihan1 {

    private static CategoryDataset createDataset() {
        final String JAN = "JANUARI";
        final String FEB = "FEBRUARI";
        final String MAR = "MARET";

        final String income = "Income"; //dalam juta
        final String QTY = "Item Terjual";
        final String TRS = "Jumlah Transaksi";

        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(1.0, JAN, income);
        dataset.addValue(3.0, JAN, TRS);
        dataset.addValue(5.0, JAN, QTY);

        dataset.addValue(4.0, FEB, income);
        dataset.addValue(6.0, FEB, TRS);
        dataset.addValue(7.0, FEB, QTY);

        dataset.addValue(3.0, MAR, income);
        dataset.addValue(5.0, MAR, TRS);
        dataset.addValue(3.0, MAR, QTY);

        return dataset;

    }

    public static void main(String[] args) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Multi-Series Bar Chart", // Chart title
                "Category", // X-axis Label
                "Value", // Y-axis Label
                createDataset(),
                PlotOrientation.VERTICAL, // Orientation (vertical)
                true, // Include legend
                true, // Tooltips
                false // URLs// Dataset
        );
        
         CategoryItemRenderer renderer = ((CategoryPlot) chart.getPlot()).getRenderer();
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);
        ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,
                TextAnchor.TOP_CENTER);
        renderer.setDefaultPositiveItemLabelPosition(position);
        
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
        
    }

}
