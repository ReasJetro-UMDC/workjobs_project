
package panelround;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
/**
 *
 * @author Jake Marson Nable
 */
public class PanelRound extends JPanel{

    public int getRoundtopleft() {
        return roundtopleft;
    }

    public void setRoundtopleft(int roundtopleft) {
        this.roundtopleft = roundtopleft;
        repaint();  
    }

    public int getRoundtopright() {
        return roundtopright;
    }

    public void setRoundtopright(int roundtopright) {
        this.roundtopright = roundtopright;
        repaint();
    }

    public int getRoundbottomleft() {
        return roundbottomleft;

    }

    public void setRoundbottomleft(int roundbuttomleft) {
        this.roundbottomleft = roundbuttomleft;
        repaint();
    }

    public int getRoundbottomright() {
        return roundbottomright;
    }

    public void setRoundbottomright(int roundbuttomright) {
        this.roundbottomright = roundbuttomright;
        repaint();
    }
    
    private int roundtopleft=0;
    private int roundtopright=0;
    private int roundbottomleft=0;
    private int roundbottomright=0;

    public PanelRound() {
        setOpaque(true);
    }
    
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 =(Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopleft());
        if (roundtopright>0){
            area.intersect(new Area(createRoundTopRight()));
        }
        if (roundbottomleft>0){
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (roundbottomright>0){
            area.intersect(new Area(createRoundBottomRight()));
        }
        
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }
    
    private Shape createRoundTopRight(){
        int width=getWidth();
        int height=getHeight();
        int roundX=Math.min(width, roundtopright);
        int roundY=Math.min(height, roundtopright);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width-roundX / 2 , width)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }
    private Shape createRoundTopleft(){
        int width=getWidth();
        int height=getHeight();
        int roundX=Math.min(width, roundtopleft);
        int roundY=Math.min(height, roundtopleft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX/2, 0, width-roundX / 2 , width)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }
    
    private Shape createRoundBottomLeft(){
        int width=getWidth();
        int height=getHeight();
        int roundX=Math.min(width, roundbottomleft);
        int roundY=Math.min(height, roundbottomleft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX/2, 0, width-roundX / 2 , width)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
    
    private Shape createRoundBottomRight(){
        int width=getWidth();
        int height=getHeight();
        int roundX=Math.min(width, roundbottomright);
        int roundY=Math.min(height, roundbottomright);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width-roundX / 2 , width)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
    
}
