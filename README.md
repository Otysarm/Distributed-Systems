# Distributed-Systems
TCP Server
The TCP server project has four classes: Client, Server, Rank, Main
Client Class creates the connection on the end users side
Server Class create the connection on the server side
The Rank Class creates the various implementations of ranks. A client request with a higher rank can command a lower rank client. When one client disconnects from the server, the ranks are updated based on a FIFO basis.
The Server Class inherits the Rank class.
