package project.tronku.miwokapplication;

public class Word {
    private Integer mImage;
    private Integer TextLinearLayout;
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation, Integer image, Integer backgroundColor){
        mImage = image;
        TextLinearLayout = backgroundColor;
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
    public Integer getBackground(){ return TextLinearLayout; }

}

