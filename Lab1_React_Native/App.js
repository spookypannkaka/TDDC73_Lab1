import { StyleSheet, Image, View } from 'react-native';
import Header from './Components/Header';
import Button from './Components/Button';
import TextInputArea from './Components/TextInputArea';
import catImage from '/assets/cat.jpg';

export default function App() {
  return (
    <View style={styles.container}>
      <Header/>

      <View style={styles.centeredContent}>
        <Image
            source={catImage}
            style={{ height: 200, width: 200 }}
            resizeMode="contain" // Adjust as needed
        />

        <View style={styles.buttonContainer}>
          <Button/>
          <Button/>
          <Button/>
          <Button/>
        </View>
      </View>

      <TextInputArea/>

    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    display: "flex",
    flexDirection: "column",
    flexWrap: "nowrap",
    justifyContent: "flex-start",
    alignItems: "flex-start",
    alignContent: "flex-start",
    gap: "30px",
    width: '100%',
    backgroundColor: "rgb(256,252,252)"
  },
  content: {
    width: '100%',
  },
  centeredContent: {
    alignItems: "center",
    justifyContent: 'center',
    gap: "30px 80px",
    overflowY: 'scroll',
  },
  buttonContainer: {
    display: "flex",
    flexDirection: "row",
    flexWrap: "wrap",
    justifyContent: "space-evenly",
    maxWidth: '100%',
    paddingHorizontal: 10,
    gap: "30px 70px" // Column Row
  },
});
