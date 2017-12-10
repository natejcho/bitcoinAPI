package com.me.bitcoin.bitcoinAPI.dataModels;

import java.io.File;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

@Slf4j
public class LinearRegressionModel {

	private static final String TRAINING_DATA_SET_FILENAME="/src/main/resources/data/bitcoin.csv";
	// private static final String PREDICTION_DATA_SET_FILENAME="test-confused.arff";

    private Evaluation evaluation;
    private Classifier classifier;

    public Instances getDataSet(String fileName) throws Exception {
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File(fileName));
        return loader.getDataSet();
    }
    
    public String crossValidation() throws Exception {
        log.debug("i'm working on it");
        Instances data = getDataSet(TRAINING_DATA_SET_FILENAME);
        evaluation = new Evaluation(data);
        classifier = new LinearRegression();
        classifier.buildClassifier(data);
        evaluation.crossValidateModel(classifier, data, 10, new Random(1206));
        return evaluation.toSummaryString();
    }

    // public void trainModel() throws Exception {
    //     Instances trainingDataSet = getDataSet(TRAINING_DATA_SET_FILENAME);
    //     /** Classifier here is Linear Regression */
    //     classifier = new LinearRegression();
    //     /** */
    //     classifier.buildClassifier(trainingDataSet);
    //     /**
    //      * train the alogorithm with the training data and evaluate the
    //      * algorithm with testing data
    //      */
    //     evaluation = new Evaluation(trainingDataSet);
    // }

    // public double testData() throws Exception {
    //     Instances testingDataSet = getDataSet(TESTING_DATA_SET_FILENAME);
    //     evaluation.evaluateModel(classifier, testingDataSet);
    //     /** Print the algorithm summary */
    //     System.out.println("** Linear Regression Evaluation with Datasets **");
    //     System.out.println(evaluation.toSummaryString());
    //     System.out.print(" the expression for the input data as per alogorithm is ");
    //     System.out.println(classifier);
        
    //     Instance predicationDataSet = getDataSet(PREDICTION_DATA_SET_FILENAME).lastInstance();
    //     double value = classifier.classifyInstance(predicationDataSet);
    //     /** Prediction Output */
    //     return value;
    // }
	
}