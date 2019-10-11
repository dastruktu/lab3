package edu.ktu.ds.lab3.utils;

/**
 *
 * @param <K> raktas
 * @param <V> reikšmė
 */
public interface MapEvaluable<K, V> extends Map<K, V> {

    /**
     * Grąžina maksimalų grandinėlės ilgį.
     *
     * @return Maksimalus grandinėlės ilgis.
     */
    int getMaxChainSize();

    /**
     * Grąžina maišos lentelę formuojant įvykusių permaišymų kiekį.
     *
     * @return Permaišymų kiekis.
     */
    int getRehashesCounter();

    /**
     * Grąžina maišos lentelės talpą.
     *
     * @return Maišos lentelės talpa.
     */
    int getTableCapacity();

    /**
     * Grąžina paskutinės papildytos grandinėlės indeksą.
     *
     * @return Paskutinės papildytos grandinėlės indeksas.
     */
    int getLastUpdatedChain();

    /**
     * Grąžina grandinėlių kiekį.
     *
     * @return Grandinėlių kiekis.
     */
    int getChainsCounter();
}
