import React from 'react';
import { Text, StyleSheet, Pressable } from 'react-native';

export default function Button(props) {
  const { onPress, title = 'BUTTON' } = props;
  return (
    <Pressable style={styles.button} onPress={onPress}>
      <Text style={styles.text}>{title}</Text>
    </Pressable>
  );
}

const styles = StyleSheet.create({
  button: {
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 8,
    paddingHorizontal: 8,
    borderRadius: 2,
    elevation: 3,
    backgroundColor: 'rgb(214,215,215)',
    flexBasis: "30%"
  },
  text: {
    fontSize: 14,
    lineHeight: 21,
    fontWeight: '550',
    letterSpacing: 0.25,
    color: 'black',
  },
});
