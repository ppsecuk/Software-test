package stock_market_example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private StockService stockService;
    private List<Stock> stocks;

    public double getMarketValue(){
        double marketValue = 0.0;

        for(Stock stock : stocks){
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public StockService getStockService() {
        return stockService;
    }

    public Portfolio() {
        stocks = new ArrayList<>();
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
