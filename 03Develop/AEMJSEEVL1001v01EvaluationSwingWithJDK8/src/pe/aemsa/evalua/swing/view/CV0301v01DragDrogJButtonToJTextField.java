package pe.aemsa.evalua.swing.view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CV0301v01DragDrogJButtonToJTextField {
    
    public static void main(String[] args) {
        Frame frame = new Frame("Example Frame");

        /*
* Create a container with a flow layout, which arranges its children
* horizontally and center aligned. A container can also be created with
* a specific layout using Panel(LayoutManager) constructor, e.g.
* Panel(new FlowLayout(FlowLayout.RIGHT)) for right alignment
 
         */
        JPanel panel = new JPanel();

        // Add a drop target text area in the center of the frame
        JComponent textArea = new DropTargetTextArea();
        frame.add(textArea, BorderLayout.CENTER);

        // Add several draggable labels to the container
        JLabel helloLabel = new DraggableLabel("Hello");
        JLabel worldLabel = new DraggableLabel("World");
        panel.add(helloLabel);
        panel.add(worldLabel);

        // Add the container to the bottom of the frame
        frame.add(panel, BorderLayout.SOUTH);

        // Display the frame
        int frameWidth = 300;
        int frameHeight = 300;
        frame.setSize(frameWidth, frameHeight);
        
        frame.setVisible(true);
    }
    
    public static class DraggableLabel extends JLabel implements DragGestureListener, DragSourceListener {
        DragSource oDS;
        
        public DraggableLabel(String psText) {
            setText(psText);
            oDS = new DragSource();
            oDS.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
        }
        
        @Override
        public void dragGestureRecognized(DragGestureEvent dge) {
            Transferable oTransferable = new StringSelection(getText());
            
            oDS.startDrag(dge, DragSource.DefaultCopyDrop, oTransferable, this);
        }
        
        @Override
        public void dragEnter(DragSourceDragEvent dsde) {
            // Called when the user is dragging this drag source and enters the drop target
            //llama cuando el usuario está arrastrando este origen de arrastre y entra en el destino de colocación
            System.out.println("Drag enter");
        }
        
        @Override
        public void dragOver(DragSourceDragEvent dsde) {
            // Called when the user is dragging this drag source and moves over the drop target
            //llamado cuando el usuario está arrastrando esta fuente de arrastre y se mueve sobre el destino de colocación
            System.out.println("Drag over");
        }
        
        @Override
        public void dropActionChanged(DragSourceDragEvent dsde) {
            // Called when the user changes the drag action between copy or move
            // llamado cuando el usuario cambia la acción de arrastre entre copiar o mover
            System.out.println("Drag action changed");
        }
        
        @Override
        public void dragExit(DragSourceEvent dse) {
            // Called when the user is dragging this drag source and leaves the drop target
            // llamado cuando el usuario está arrastrando esta fuente de arrastre y deja el destino de colocación
            System.out.println("Drag exit");
        }
        
        @Override
        public void dragDropEnd(DragSourceDropEvent dsde) {
            // Called when the user finishes or cancels the drag operation
            //llamada cuando el usuario finaliza o cancela la operación de arrastre
            System.out.println("Drag action End");
        }
    }

    // Make a TextArea a drop target; You can use the example to make any component a drop target
    // Use esto para hacer que un componente sea un objetivo de caída
    public static class DropTargetTextArea extends JTextArea implements DropTargetListener {
        
        @Override
        public void dragEnter(DropTargetDragEvent dtde) {
            // Called when the user is dragging and enters this drop target
            System.out.println("Drop enter");
        }
        
        @Override
        public void dragOver(DropTargetDragEvent dtde) {
            // Called when the user is dragging and moves over this drop target
            System.out.println("Drop over");
        }
        
        @Override
        public void dropActionChanged(DropTargetDragEvent dtde) {
            // Called when the user changes the drag action between copy or move
            System.out.println("Drop action changed");
        }
        
        @Override
        public void dragExit(DropTargetEvent dte) {
            // Called when the user is dragging and leaves this drop target
            System.out.println("Drop exit");
        }
        
        @Override
        public void drop(DropTargetDropEvent dtde) {
            // Called when the user finishes or cancels the drag operation
            try {
                Transferable oTransferable = dtde.getTransferable();
                if (oTransferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
                    String sDragContents = (String) oTransferable.getTransferData(DataFlavor.stringFlavor);
                    dtde.getDropTargetContext().dropComplete(true);
                    // We append the label text to the text area when dropped
 
                    setText(getText() + " " + sDragContents);
  
                } else {
                    dtde.rejectDrop();
                }
            } catch (IOException | UnsupportedFlavorException ex) {
                dtde.rejectDrop();
            }
        }
        
    }
}
