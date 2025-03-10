package com.portfolio.controller;

import com.am.common.amcommondata.domain.asset.Asset;
import com.am.common.amcommondata.domain.portfolio.Portfolio;
import com.am.common.amcommondata.model.PortfolioModel;
import com.am.common.amcommondata.model.asset.AssetModel;
import com.am.common.amcommondata.model.enums.AssetType;
import com.portfolio.service.AMPortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/portfolios")
@RequiredArgsConstructor
public class PortfolioController {
    
    private final AMPortfolioService portfolioService;

    @GetMapping("/{portfolioId}")
    public ResponseEntity<PortfolioModel>  getPortfolioById(@PathVariable String portfolioId) {
        return ResponseEntity.ok(portfolioService.getPortfolioById(UUID.fromString(portfolioId)));
    }

    @GetMapping
    public ResponseEntity<List<PortfolioModel>> getPortfolios(@RequestParam String userId) {
        return ResponseEntity.ok(portfolioService.getPortfolios(userId));
    }

    @GetMapping("/{userId}/summary")
    public ResponseEntity<PortfolioModel> getPortfolioSummary(@PathVariable UUID userId) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{userId}/holdings")
    public ResponseEntity<List<AssetModel>> getHoldingsByAssetType(
            @PathVariable UUID userId,
            @RequestParam(required = false) AssetType assetType) {
        return ResponseEntity.ok(null);
    }

}
