
package lv.iljapavlovs.cukesrest.dto.json2pojo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PetDto {

    @SerializedName("category")
    private Category mCategory;
    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("photoUrls")
    private List<String> mPhotoUrls;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("tags")
    private List<Tag> mTags;

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<String> getPhotoUrls() {
        return mPhotoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        mPhotoUrls = photoUrls;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public List<Tag> getTags() {
        return mTags;
    }

    public void setTags(List<Tag> tags) {
        mTags = tags;
    }

}
