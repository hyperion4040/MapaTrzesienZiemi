package edu.wsb.week3;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

/**
 * Created by hyperion on 06.06.17.
 * @author Adrian Kozłowski
 * @author Twoje imię
 */
public class EarthquakeMap extends PApplet {

    UnfoldingMap map;

    Location m1 = new Location(65.0,65.0);
    SimplePointMarker mark1 = new SimplePointMarker(m1);
    //todo Utworzyć ArrayList lub HashSet lub tablicę klasy Lokacja i uzupełnić go o dane wedle uznania.




    public static SimplePointMarker marker(double długośćGeograficzna, double szerokośćGeograficzna){
        return new SimplePointMarker(new Location(długośćGeograficzna,szerokośćGeograficzna));
    }


    public void setup(){

        size(950, 600, OPENGL);
        map = new UnfoldingMap(this,200,50,650,600,new Google.GoogleMapProvider());
        map.zoomToLevel(2);
        MapUtils.createDefaultEventDispatcher(this, map);
    }




    public void draw() {
        background(10);
        map.draw();
        /*
         Todo: Dodać pętle for each, a poniższą linijkę tak zmodyfikować, by
          todo na mapie zostały zaznaczone wszystkie punkty, a nie jeden jak w kodzie
          todo     poniżej
        */
        map.addMarker(marker(Lokacja.getDługośćGeograficzna(0),Lokacja.getSzerokośćGeograficzna(0)));


    }





}
