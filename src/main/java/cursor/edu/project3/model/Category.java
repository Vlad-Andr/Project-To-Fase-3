package cursor.edu.project3.model;

public enum Category {
    ACTION("action"),
    DETECTIVE("detective"),
    COMEDY("comedy"),
    HORROR("horror"),
    ADVENTURE("adventure"),
    OTHER("other");

    private String categoryView;

    Category(String categoryView) {
        this.categoryView = categoryView;
    }

    public static Category findCategory(String category) {
        for (Category wantedCategory : Category.values()) {
            if (wantedCategory.getCategory().equalsIgnoreCase(category))
                return wantedCategory;
        }
        return Category.OTHER;
    }

    public String getCategory() {
        return categoryView;
    }
}