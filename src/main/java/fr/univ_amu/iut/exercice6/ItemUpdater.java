package fr.univ_amu.iut.exercice6;

public abstract class ItemUpdater {
  private final Item item;

  public ItemUpdater(Item item) {
    this.item = item;
  }

  public abstract void update();

  public void increaseQuality() {
    item.quality++;
  }

  public void decreaseQuality() {
    item.quality--;
  }

  public void decreaseSellIn() {
    item.sellIn--;
  }

  public Item getItem() {
    return item;
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
