
with import <nixpkgs> {};

stdenv.mkDerivation rec {
  name = "env";
  env = buildEnv {
    name = name;
    paths = buildInputs;
  };

  tile38 = callPackage ./tile38 { };

  buildInputs = [
    git
    vim
    tile38
    pants
    openjdk8
  ];
}
