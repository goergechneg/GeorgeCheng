
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();
  }
  
  public static void testKeepOnlyGren(){
  Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
  beach.explore();
  beach.keepOnlyGreen();
  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\snowman.jpg");
	    snowman.explore();
	    snowman.mirrorArms();
	    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture snowman = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\seagull.jpg");
	    snowman.explore();
	    snowman.mirrorGull();
	    snowman.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture barbara = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\barbaraS.jpg");
	  barbara.explore();
	  barbara.mirrorDiag();
	  barbara.explore();
  }
  /* Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\GeorgeCheng\\Unit16-Picture-Lab\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEncode()
  {
	  Picture swan = new Picture("C:\\Users\\George\\eclipse-workspace\\Unit16\\bin\\images\\swan.jpg");
	  Picture message = new Picture("C:\\Users\\George\\eclipse-workspace\\Unit16\\bin\\images\\apple.jpg");
	  swan.explore();
	  swan.encode(message);
	  swan.explore();
	  swan.decode().explore();
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 testEncode();
  }
}