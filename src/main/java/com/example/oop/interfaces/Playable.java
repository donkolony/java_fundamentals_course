/*
Exercise Task:
Create a class Guitar that implements Playable.
Its play() method should print: "Strumming the guitar strings."
Create a class VideoGame that implements Playable.
Its play() method should print: "Loading the game levels."
Notice that a Guitar and a VideoGame are totally different things (not related by inheritance), but they both share the capability of being "played."
In a Main class:
Create a List<Playable> (or an array Playable[]).
Add a Guitar and a VideoGame to the list.
Loop through and call .play() on each.
 */

package com.example.oop.interfaces;

public interface Playable {

    /*
    Methods in interfaces are public and abstract by default
    Example:
    public class Guitar implements Playable {
        @Override
        public void play() { // Adding 'public' fixes the error!
            System.out.println("Strumming the guitar strings.");
        }
    }
     */
    void play();
}