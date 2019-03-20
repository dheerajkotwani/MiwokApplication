package project.tronku.miwokapplication;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private Integer mImage = NO_IMAGE_PROVIDED;
    private Integer TextLinearLayout;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private Integer audio;


    public Word(String defaultTranslation, String miwokTranslation, Integer image, Integer audioId){
        mImage = image;
//        TextLinearLayout = backgroundColor;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        audio = audioId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public  Integer getAudio(){
        return audio;
    }
    public Integer getImage(){
        return mImage;
    }
//    public Integer getBackground(){ return TextLinearLayout; }
    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }

}

