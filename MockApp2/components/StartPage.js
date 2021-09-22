import React from 'react';
import {View, Text, TouchableOpacity} from 'react-native';

const StartPage = (props) => {
    return (
        <View>
            <Text>“There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.”
― Albert Einstein </Text>
        <TouchableOpacity onPress={props.enterApp}>
            <Text>Continue</Text>
        </TouchableOpacity>
        </View>
    )
}

export default StartPage;