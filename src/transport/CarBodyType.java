package transport;

public enum CarBodyType {
    BODY_TYPE1("Седан"),
    BODY_TYPE2("Хетчбек"),
    BODY_TYPE3("Купе"),
    BODY_TYPE4("Универсал"),
    BODY_TYPE5("Внедорожник"),
    BODY_TYPE6("Кроссовер"),
    BODY_TYPE7("Пикап"),
    BODY_TYPE8("Фургон"),
    BODY_TYPE9("Минивэн");

    private final String carBody;

    CarBodyType(String carBody) {
        this.carBody = carBody;
    }

    public String getCarBody() {
        return carBody;
    }

    @Override
    public String toString() {
        return "Тип кузова: " +
                carBody;
    }
}
