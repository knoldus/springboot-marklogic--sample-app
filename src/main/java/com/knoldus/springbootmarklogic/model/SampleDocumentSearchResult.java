package com.knoldus.springbootmarklogic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SampleDocumentSearchResult {

    private List<SampleDocument> sampleDocuments;
}
