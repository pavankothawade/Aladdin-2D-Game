var MongoClient = require('mongodb').MongoClient;
var db;
var connected = false;
var mongoURL = "mongodb://localhost:27017/kafka";
var connections = {};
/**
 * Connects to the MongoDB Database with the provided URL
 */

for(var i=0;i<200;i++)
{
    MongoClient.connect(mongoURL, function (err, _db) {
        if (err) {
            throw new Error('Could not connect: ' + err);
        }
        connections[i] = (_db);
        _db["id"] = i;
        connected = true;
        console.log(connected + " is connected?");
        //callback(_db);
    });
}
 var busyconnections = {};
exports.connect = function(url, callback){


};



exports.getConnection = function() {

    for(var key in connections) {
        console.log(connections[key]);
        var conn = connections[key];
        delete connections[key];
        busyconnections[key] = conn;
        return conn;
    }
};


exports.putConnection = function(conn) {
    if(!conn) {
        throw new Error("Specify Connection object!!!");
    }

    delete busyconnections[conn["id"]];
    connections[conn["id"]] = conn;


}
/**
 * Returns the collection on the selected database
 */
exports.collection = function(name){
    if (!connected) {
      throw new Error('Must connect to Mongo before calling "collection"');
    } 
    return db.collection(name);
  
};


background-position: top; width: 100%; height: 100%; background-image: url("http://www.megawpthemes.com/wordpress/builder/wp-content/uploads/revslider/home/slider_02.jpg"); background-repeat: no-repeat; visibility: inherit; z-index: 20; opacity: 1; background-size: cover; background-color: transparent;