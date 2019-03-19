package project.tronku.miwokapplication;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private Integer mImage = NO_IMAGE_PROVIDED;
    private Integer TextLinearLayout;
    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation, Integer image){
        mImage = image;
//        TextLinearLayout = backgroundColor;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public Integer getImage(){
        return mImage;
    }
//    public Integer getBackground(){ return TextLinearLayout; }
    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }

}

