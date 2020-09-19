package com.ms.search;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SearchCriteria {
    private String key; //first name, last name
    private Object value; // Tofik, Tural
    private SearchOperation operation; //Equal, Like, StratsWIth

}
