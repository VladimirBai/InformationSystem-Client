package controller;

import javafx.collections.ObservableList;
import model.*;

import java.util.List;

public interface UITrackList {
    int size();
    List<UITrack> getTracks(int page);
    List<UITrack> delete(UITrack track);
    void markAsChanged(UITrack track);
    void markAsNew(UITrack track);
    UITrack newTrack();
    void synchronize();
    List<UITrack> find(String artists, String album, String name, String duration, String genre);
    void setTracks(List<UITrack> tracks);
    List<UITrack> fixedDelete(UITrack track);
    int currentPage();
}
