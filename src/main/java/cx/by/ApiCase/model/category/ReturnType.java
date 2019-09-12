package cx.by.ApiCase.model.category;

/**
 * Project name: ApiCase
 *
 * Type of Response
 *
 * Create by: Image
 *
 * Create at: 2019-09-12
 **/
public enum  ReturnType {
    Text("Text"),Image("Image"),File("file"),Video("Video"),Audio("Audio");
    private String type;
    ReturnType(String t){
        this.type=t;
    }
}
