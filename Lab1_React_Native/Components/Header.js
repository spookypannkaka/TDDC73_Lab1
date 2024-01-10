import React from 'react'
import { View, Text, StyleSheet, StatusBar } from 'react-native';

function Header() {
  return (
    <View style={styles.header}>¨
      <StatusBar/>
      <Text style={styles.title}>Example 1</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  header: {
    display: "flex",
    alignItems: 'center',
    width: '100%',
    height: "8%",
    backgroundColor: 'rgb(45,133,119)',
    justifyContent: 'center',
    alignItems: 'flex-start',
  },
  title: {
    position: "absolute",
    paddingLeft: "0.5em",
    color: "#fff",
    fontWeight: "600",
    fontSize: "large",
    margin: 0
  },
});

export default Header;