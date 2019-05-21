
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    
    private Square left_tower0;
    private Square left_tower1;
    private Square left_tower2;
    private Square right_tower0;
    private Square right_tower1;
    private Square right_tower2;
    private Square left_window;
    private Square right_window;
    private Square main_mini;
    private Square left_mini;
    private Square right_mini;
    
    private Triangle left_tower_tri;
    private Triangle right_tower_tri;
    private Triangle left_mini_tri;
    private Triangle right_mini_tri;
    private Triangle main_mini_tri;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        draw();// nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        left_tower0 = new Square(); 
        left_tower1 = new Square(); 
        left_tower2 = new Square(); 
        right_tower0 = new Square();
        right_tower1 = new Square();
        right_tower2 = new Square();
        left_window = new Square();
        right_window = new Square();
        main_mini = new Square();
        left_mini = new Square();
        right_mini = new Square();
        
        // triangles
        left_tower_tri = new Triangle();
        right_tower_tri = new Triangle();
        left_mini_tri = new Triangle();
        right_mini_tri = new Triangle();
        main_mini_tri = new Triangle();
        
     
        
        left_tower0.moveVertical(90);
        left_tower0.moveHorizontal(5);
        
        left_tower1.moveVertical(150);
        left_tower1.moveHorizontal(5);
        
        left_tower2.moveVertical(210);
        left_tower2.moveHorizontal(5);
        
        right_tower0.moveVertical(90);
        right_tower0.moveHorizontal(235);
        
        right_tower1.moveVertical(150);
        right_tower1.moveHorizontal(235);
        
        right_tower2.moveVertical(210);
        right_tower2.moveHorizontal(235);
        
        left_window.moveVertical(110);
        left_window.moveHorizontal(20);
        
        right_window.moveVertical(110);
        right_window.moveHorizontal(250);
        
        left_mini.moveVertical(230);
        left_mini.moveHorizontal(100);
        
        right_mini.moveVertical(230);
        right_mini.moveHorizontal(160);
        
        main_mini.moveVertical(210);
        main_mini.moveHorizontal(120);
        
        right_mini_tri.moveVertical(200);
        right_mini_tri.moveHorizontal(115);
        right_mini_tri.changeSize(30, 30);
        
        left_mini_tri.moveVertical(200);
        left_mini_tri.moveHorizontal(185);
        left_mini_tri.changeSize(30,30);
        
        left_tower_tri.moveVertical(30);
        left_tower_tri.moveHorizontal(35);
        left_tower_tri.changeSize(60, 60);
        
        main_mini_tri.moveVertical(150);
        main_mini_tri.moveHorizontal(150);
        main_mini_tri.changeSize(60,60);
        
        right_tower_tri.moveVertical(30);
        right_tower_tri.moveHorizontal(265);
        right_tower_tri.changeSize(60, 60);
        
        // all sizes
        left_tower0.changeSize(60);
        left_tower1.changeSize(60);
        left_tower2.changeSize(60);
        right_tower0.changeSize(60);
        right_tower1.changeSize(60);
        right_tower2.changeSize(60);
        left_window.changeSize(30);
        right_window.changeSize(30);
        main_mini.changeSize(60);
        left_mini.changeSize(40);
        right_mini.changeSize(40);
        
        //all colors
        right_window.changeColor("black");
        left_window.changeColor("black");
        
        /*wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        */
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
