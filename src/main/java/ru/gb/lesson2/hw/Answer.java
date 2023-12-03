package ru.gb.lesson2.hw;

class Answer {

  public static void main(String[] args) {

    System.out.println("abcde".substring(1, "abcde".length() - 1));

    String QUERY = "select * from students where ";
    String PARAMS = "{\"name\":\"null\", \"country\":\"Russian\", \"city\":\"null\", \"age\":\"null\"} ";
    System.out.println(answer(QUERY, PARAMS));
  }


  public static StringBuilder answer(String query, String params){
    params = params.trim();
    params = params.substring(1, params.length() - 1);

    StringBuilder sb = new StringBuilder(query);
    String[] parts = params.split(", ");
    for (String part : parts) {
      String[] fieldAndValue = part.split(":");
      String field = fieldAndValue[0].replace("\"", "");
      String value = fieldAndValue[1].replace("\"", "\'");

      if (!value.equals("'null'")) {
        sb.append(field).append("=").append(value).append(" and ");
      }
    }
    if (sb.substring(sb.length() - 5, sb.length()).equals(" and ")) {
      sb.delete(sb.length() - 5, sb.length());
    }
    return sb;
  }
}