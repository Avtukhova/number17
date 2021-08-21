package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieInfo {
    private int id; //идентификатор записи в афише
    private int idMovie; //идентификатор фильма
    private String movieName;  //имя фильма

}
