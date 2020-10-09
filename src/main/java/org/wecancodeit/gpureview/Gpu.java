package org.wecancodeit.gpureview;

public class Gpu {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private String reviewCategory;
    private String content;



    public Gpu(long id, String name, String imageUrl, String reviewCategory, String content) {
    this.id = id;
    this.name = name;
    this.description = content;
    this.imageUrl = imageUrl;
    this.reviewCategory = reviewCategory;
    this.content = content;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }
}
