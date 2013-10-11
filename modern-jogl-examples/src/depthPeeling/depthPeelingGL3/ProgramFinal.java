/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package depthPeeling.depthPeelingGL3;

import glsl.GLSLProgramObject;
import javax.media.opengl.GL3;

/**
 *
 * @author gbarbieri
 */
public class ProgramFinal extends GLSLProgramObject{
    
    private int colorTexUnLoc;
    private int backgroundColorUnLoc;
    private int modelToClipMatrixUnLoc;
    
    public ProgramFinal(GL3 gl3, String shadersFilepath, String vertexShader, String fragmentShader, int mvpMatrixBlockIndex) {

        super(gl3, shadersFilepath, vertexShader, fragmentShader);

        init(gl3);
    }

    public ProgramFinal(GL3 gl3, String shadersFilepath, String[] vertexShaders, String[] fragmentShaders, int mvpMatrixBlockIndex) {

        super(gl3, shadersFilepath, vertexShaders, fragmentShaders);

        init(gl3);
    }
    
    private void init(GL3 gl3){
        
        colorTexUnLoc = gl3.glGetUniformLocation(getProgramId(), "ColorTex");
        
        backgroundColorUnLoc = gl3.glGetUniformLocation(getProgramId(), "BackgroundColor");
        
        modelToClipMatrixUnLoc = gl3.glGetUniformLocation(getProgramId(), "modelToClipMatrix");
    }

    public int getColorTexUnLoc() {
        return colorTexUnLoc;
    }

    public int getBackgroundColorUnLoc() {
        return backgroundColorUnLoc;
    }

    public int getModelToClipMatrixUnLoc() {
        return modelToClipMatrixUnLoc;
    }
}