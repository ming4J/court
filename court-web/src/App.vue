<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>

body {
  margin: 0;
  padding: 0;
  font-size: 14px;
  text-align: center;
}

ul,.li {
  list-style: none;
}

a {
  text-decoration: none;
}

#app {
  font-family: "Microsoft YaHei", Arial, "";
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2f2f2f;
}
</style>
