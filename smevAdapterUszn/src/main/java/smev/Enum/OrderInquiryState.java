package smev.Enum;



public enum OrderInquiryState
{

  UNKNOWN(""),

  IN_WORK("в ожидании ответа"),

  WARNING("предупреждение"),

  TIME_OUT("время вышло"),

  SUCCESS("успешно"),

  ERROR("ошибка");

  private final String stateName;

  OrderInquiryState(String stateName) {
    this.stateName = stateName;
  }

  public String stateName() {
    return stateName;
  }



//  public static ReceiveMessageStatus getStatusJobById(Integer id) {
//    for (ReceiveMessageStatus e : values()) {
//      if (e.index == id)
//        return e;
//    }
//    return null;
//  }

}

