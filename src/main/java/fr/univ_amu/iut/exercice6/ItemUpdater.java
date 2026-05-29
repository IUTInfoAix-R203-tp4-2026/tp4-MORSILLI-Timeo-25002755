package fr.univ_amu.iut.exercice6;

public abstract class ItemUpdater {
  public final Item item;

  public ItemUpdater(Item item) {
    this.item = item;
  }

  public abstract void update();

  public void increaseQuality() {
    if (item.quality < 50) item.quality++;
  }

  public void decreaseQuality() {
    if (item.quality > 0) item.quality--;
  }

  public void decreaseSellIn() {
    item.sellIn--;
  }

  public void clearQuality() {
    item.quality = 0;
  }

  public static ItemUpdater creer(Item item) {
    return switch (item.name) {
      case "Aged Brie" -> new BrieItem(item);
      case "Sulfuras, Hand of Ragnaros" -> new SulfurasItem(item);
      case "Backstage passes to a TAFKAL80ETC concert" -> new BackstageItem(item);
      default -> new NormalItem(item);
    };
  }
}
