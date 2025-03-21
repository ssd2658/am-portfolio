package com.portfolio.model;

import java.time.Instant;

import com.am.common.investment.model.equity.MarketIndexIndices;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketIndexIndicesCache {
    private String key;
    private String index;
    private String indexSymbol;
    private MarketIndexIndices indexIndices;
    private Instant timestamp;
}
