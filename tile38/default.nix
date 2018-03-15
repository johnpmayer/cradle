
{ stdenv, fetchurl }:

stdenv.mkDerivation rec {
  name = "tile38";

  src = fetchurl {
    url = "https://github.com/tidwall/tile38/releases/download/1.11.0/tile38-1.11.0-linux-amd64.tar.gz";
    sha256 = "056mrkc131a4adjz9ni6qk0rky100ssb3fhzc795mf6p3ap47vaf";
  };

  builder = ./builder.sh;
}
