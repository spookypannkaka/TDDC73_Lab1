import React from 'react';
import { View, Text, TextInput, StyleSheet } from 'react-native';

const TextInputArea = () => {
    return (
        <View style={styles.textInputContainer}>
            <Text style={styles.textTitleStyle}>Email</Text>
            <TextInput style={styles.textBoxStyle}/>
        </View>
    );
};

const styles = StyleSheet.create({
    textInputContainer: {
        display: "flex",
        flexDirection: 'row',
        flexWrap: "wrap",
        alignItems: 'flex-start',
        alignContent: "flex-start",
        justifyContent: 'flex-start',
        gap: "10px 60px", // Column Row
        marginBottom: 30,
        marginLeft: 10
    },
    textBoxStyle: {
        borderBottomWidth: 3,
        borderBottomColor: '#cb125a',
        caretColor: '#cb125a',
        outlineStyle: 'none'
    },
    textTitleStyle: {
        color: 'gray',
        marginRight: 20,
    },
});
  
export default TextInputArea