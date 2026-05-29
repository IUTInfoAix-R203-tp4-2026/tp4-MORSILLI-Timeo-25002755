package fr.univ_amu.iut.exercice6;

public class NormalItem extends ItemUpdater {

  public NormalItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    decreaseQuality();

    decreaseSellIn();

    if (item.sellIn < 0) decreaseQuality();
  }
}
