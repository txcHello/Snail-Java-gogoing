package select;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author Administrator
 * @Date 2022/10/30 21:05
 * @Version 1.0
 * Desc:
 */
public class SelectorServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel open = ServerSocketChannel.open();
        open.configureBlocking(false);
        open.bind(new InetSocketAddress(9999));
        Selector selector = Selector.open();
        open.register(selector, SelectionKey.OP_ACCEPT);

        while (selector.select()>0){
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                if (next.isAcceptable()){
                    System.out.println("accptable");
                }else  if (next.isConnectable()){
                    System.out.println("connectable");
                }else if ( next.isReadable()
                ){

                }
                System.out.println();

            }
        }
    }
}
