public class TextEditor implements TextWriter{

    private TextRendering textRendering;

    public TextEditor(TextRendering textRendering){
        this.textRendering = textRendering;
    }

    @Override
    public void writeTextWithTextRenderParameters() {
        textRendering.setFront();
        textRendering.setFrontSize();
    }
}
