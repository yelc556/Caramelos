/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author kz
 */
public class ExcepcionPausa extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionPausa</code> without detail
     * message.
     */
    public ExcepcionPausa() {
    }

    /**
     * Constructs an instance of <code>ExcepcionPausa</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionPausa(String msg) {
        super(msg);
    }
}
