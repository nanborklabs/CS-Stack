package com.csstack;

import com.csstack.Model.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandhu on 27/1/17.
 * THe Class whic creates Topic for the whole app
 *
 * each topic is initialized only if Requested by provideing year, subject, unit
 */
public class TopicUtils {



    public static List<Topic> getTopics(String year, String subject, String unit) {

        List<Topic> mList ;

        mList = getTopicList(subject,unit);
        return mList;
    }

    private static List<Topic> getTopicList(String subject, String unit) {

        //First Filter Subject

        /*-----------------First Year ----------------*/

        //Priniciples of Computing
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
        //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

        //
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

        //


        /*----------------------Second Year------------------------*/

        if (subject.equals("ca") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":
                    caList.add(new Topic("Units of a Digital Computer","https://en.wikipedia.org/wiki/Computer_architecture");
                    caList.add(new Topic("Hardware","https://en.wikipedia.org/wiki/Computer_hardware");
                    caList.add(new Topic("Software Interface","https://en.wikipedia.org/wiki/Application_binary_interface");
                    caList.add(new Topic("Hardware Language","https://en.wikipedia.org/wiki/Hardware_description_language");
                    caList.add(new Topic("Instruction Set Architecture","https://en.wikipedia.org/wiki/Instruction_set");
                    caList.add(new Topic("RISC and CISC Architectures","https://en.wikipedia.org/wiki/Reduced_instruction_set_computing");
                    caList.add(new Topic("Performance Metrics –","https://en.wikipedia.org/wiki/Computer_performance");
                    caList.add(new Topic("Amdahl’s Law","https://en.wikipedia.org/wiki/Amdahl%27s_law");


                    break;
                case "1":
                    caList.add(new Topic("Components of the Processor","http://www.multiwingspan.co.uk/as2.php?page=cpu";
                    caList.add(new Topic("Datapath and Control","https://en.wikipedia.org/wiki/Datapath";
                    caList.add(new Topic("Execution of a Complete Instruction","https://www.cs.umd.edu/class/sum2003/cmsc311/Notes/Overall/steps.html"
                    caList.add(new Topic("Hardwired and Micro programmed Control","https://en.wikipedia.org/wiki/Instruction-level_parallelism"
                    caList.add(new Topic("Instruction Level Parallelism","https://en.wikipedia.org/wiki/Instruction-level_parallelism"
                    caList.add(new Topic("Pipelining","https://en.wikipedia.org/wiki/Pipelining_(DSP_implementation)"
                    caList.add(new Topic("Hazard","https://en.wikipedia.org/wiki/Hazard_(computer_architecture)");
                    break;
                case "2":
                    caList.add(new Topic("Exploitation of more ILP","https://en.wikipedia.org/wiki/Memory_hierarchy");
                    caList.add(new Topic("Dynamic Scheduling", "https://en.wikipedia.org/wiki/CPU_cache";);
                    caList.add(new Topic("Speculation","https://en.wikipedia.org/wiki/Virtual_memory");
                    caList.add(new Topic("Compiler Approaches","https://en.wikipedia.org/wiki/Memory_management";);
                    caList.add(new Topic("Multiple Issue Processors","https://en.wikipedia.org/wiki/Content-addressable_memory";);
                    caList.add(new Topic("ILP and Thread Level Parallelism","https://en.wikipedia.org/wiki/Input/output#Interface";);
                    caList.add(new Topic("Multicore Processors","https://en.wikipedia.org/wiki/Interrupt";);
                    caList.add(new Topic("Graphics and Computing GPUs","https://en.wikipedia.org/wiki/Direct_memory_access";);
                    break;
                case "3":
                    caList.add(new Topic("Addition and Subtraction","https://en.wikipedia.org/wiki/Adder_(electronics)");
                    caList.add(new Topic("Fast Adders","https://en.wikipedia.org/wiki/Carry-lookahead_adder");
                    caList.add(new Topic("Binary Multiplication","https://en.wikipedia.org/wiki/Binary_multiplier");
                    caList.add(new Topic("Binary Division","https://en.wikipedia.org/wiki/Binary_number#Division";););
                    caList.add(new Topic("Floating Point Numbers","https://en.wikipedia.org/wiki/Floating_point";);
                    break;
                case "4":
                    caList.add(new Topic("hierarchical memory system");
                    caList.add(new Topic("Cache memories");
                    caList.add(new Topic("Improving cache performance");
                    caList.add(new Topic("Virtual memory");
                    caList.add(new Topic("Memory management technique");
                    caList.add(new Topic("Associative memories");
                    caList.add(new Topic("Accessing I/O devices");
                    caList.add(new Topic("Interrupts");
                    caList.add(new Topic("Direct Memory Access");
                    caList.add(new Topic("Standard I/O Interfaces");
                    break;
                default:
                    break;
            }
            return caList;
        }

        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

//

        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

//

        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }


       /*------------------------Third year----------------------*/

        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

        //
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }

//
        if (subject.equals("cg") ){
            List<Topic> cgList  = new ArrayList<>();
            //
            switch (unit){

                case "0":
                    cgList.add(new Topic("Basics",);
                    cgList.add(new Topic("Input Primitives");
                    cgList.add(new Topic("OpenGL");
                    cgList.add(new Topic("Output Primitives");



                    break;
                case "1":
                    cgList.add(new Topic("2D Viewing");
                    cgList.add(new Topic("Window");
                    cgList.add(new Topic("View Port Transformation");
                    cgList.add(new Topic("2D Geometric Transormations");
                    cgList.add(new Topic("Clipping Alorithms");
                    break;
                case "2":
                    cgList.add(new Topic("Projections");
                    cgList.add(new Topic("Three Dimensional Object Representations");
                    cgList.add(new Topic("Parallel & Perspective Polygons");

                    cgList.add(new Topic("3D Affine Transforamtions");
                    cgList.add(new Topic("3D Rotations using Quatemions");
                    cgList.add(new Topic("Viewing");

                    cgList.add(new Topic("Visible Surface Identification");
                    cgList.add(new Topic("Color models");
                    break;
                case "3":
                    cgList.add(new Topic("Multimedia");
                    cgList.add(new Topic("Animations");
                    cgList.add(new Topic("Compression & Types");
                    cgList.add(new Topic("Image Compression");

                    cgList.add(new Topic("Video Compression");
                    cgList.add(new Topic("File Format ");
                    cgList.add(new Topic("Multimedia Data structres-KD Trees , R-Trees");
                    break;
                case "4":
                    cgList.add(new Topic("Authoring Systemsi");
                    cgList.add(new Topic("Video on Demand");
                    cgList.add(new Topic("Virtual Reality");

                    cgList.add(new Topic("Augumented Reality");
                    cgList.add(new Topic("Content based Retrivel");
                    break;
                default:
                  return null;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        /*------------------Foruth year---------------*/

        if (subject.equals("ai") ){
            List<Topic> aiList  = new ArrayList<>();
            //
            switch (unit){

                case "0":
                    aiList.add(new Topic("Introudction","https://en.wikipedia.org/wiki/Artificial_intelligence"));
                    aiList.add(new Topic("Intelligent Agents","https://en.wikipedia.org/wiki/Intelligent_agent"));
                    aiList.add(new Topic("Types of Agents","https://en.wikipedia.org/wiki/Artificial_intelligence#Deduction.2C_reasoning.2C_problem_solving"));
                    aiList.add(new Topic("Problem Solving in AI","https://en.wikipedia.org/wiki/Intelligent_agent#Classes_of_intelligent_agents"));

//                    // TODO: 28/1/17 misisng info
                    aiList.add(new Topic("","http://www.sdsc.edu/~tbailey/teaching/cse151/lectures/chap03a.html"));

                    return aiList;



                case "1":
                    aiList.add(new Topic("Uniformed Search Strategies","http://www.codeproject.com/Articles/203828/AI-Simple-Implementation-of-Uninformed-Search-Stra"));
                    aiList.add(new Topic("Local Search Algorithams","http://artint.info/html/ArtInt_56.html"));
                    aiList.add(new Topic("Heuristics","https://en.wikipedia.org/wiki/Local_search_(optimization)"));
                    aiList.add(new Topic("Constraint satisfaction problem","https://en.wikipedia.org/wiki/Constraint_satisfaction_problem"));
                    aiList.add(new Topic("Backtracking","https://en.wikipedia.org/wiki/Backtracking#Description_of_the_method"));
                    aiList.add(new Topic("Game Playing","http://cis-linux1.temple.edu/~pwang/3203-AI/Lecture/Game.htm"));
                    aiList.add(new Topic("Pruning","https://en.wikipedia.org/wiki/Pruning_(decision_trees)"));
                    aiList.add(new Topic("Alpha-Beta Pruning","https://en.wikipedia.org/wiki/Alpha%E2%80%93beta_pruning"));
                    return aiList;

                case "2":
                    aiList.add(new Topic("Predicate Calculus","https://en.wikipedia.org/wiki/Predicate_logic"));
                    aiList.add(new Topic("First Order Prdeicate Logic","https://en.wikipedia.org/wiki/First-order_logic"));
                    aiList.add(new Topic("Unification","https://en.wikipedia.org/wiki/Unification_(computer_science)"));
                    aiList.add(new Topic("Forward Chaining","https://en.wikipedia.org/wiki/Forward_chaining"));
                    aiList.add(new Topic("Backward Chaining","https://en.wikipedia.org/wiki/Backward_chaining"));
                    aiList.add(new Topic("Knowledge Representation","http://groups.csail.mit.edu/medg/ftp/psz/k-rep.html#kr"));
                    aiList.add(new Topic("Ontological Engineering","http://artint.info/html/ArtInt_11.html"));
//                    // TODO: 28/1/17 missing url
                    aiList.add(new Topic("Reasoning and Acting",""));

                    return aiList;
                case "3":
                    aiList..add(new Topic("Probability basics","https://en.wikipedia.org/wiki/Probability");
                    aiList.add(new Topic("Bayes Rule","https://en.wikipedia.org/wiki/Bayes%27_rule");
                    aiList.add(new Topic("Bayesian Networks","https://en.wikipedia.org/wiki/Bayesian_network");
                    aiList.add(new Topic("Inference","https://en.wikipedia.org/wiki/Inference");
                    aiList.add(new Topic(" Markov Models","https://en.wikipedia.org/wiki/Markov_model");
//                    // TODO: 28/1/17 MU
                    aiList.add(new Topic("Types of Learning","");
                    aiList.add(new Topic("Learning Decision Trees","https://en.wikipedia.org/wiki/Decision_tree_learning");
                    aiList.add(new Topic("Regression","https://en.wikipedia.org/wiki/Regression_analysis");
                    aiList.add(new Topic("Artificial Neural Networks","https://en.wikipedia.org/wiki/Artificial_neural_network");
                    aiList.add(new Topic("Non Parametric Models","https://en.wikipedia.org/wiki/Nonparametric_statistics");
                    aiList.add(new Topic("SUpport Vector Machines","https://en.wikipedia.org/wiki/Support_vector_machine");
                    aiList.add(new Topic("Statistical Learning","https://en.wikipedia.org/wiki/Statistical_learning_theory");
                    aiList.add(new Topic("The EM Algorithm","https://en.wikipedia.org/wiki/Expectation%E2%80%93maximization_algorithm");
                    aiList.add(new Topic("Reinforcement Learning","https://en.wikipedia.org/wiki/Reinforcement_learning");

                    return aiList;
                case "4":
                    aiList.add(new Topic("AI Applications","https://en.wikipedia.org/wiki/Applications_of_artificial_intelligence");
                    aiList.add(new Topic("Language Models","https://en.wikipedia.org/wiki/Language_model");
                    aiList.add(new Topic("Information Retrival","https://en.wikipedia.org/wiki/Information_retrieval");
                    aiList.add(new Topic("Natural Language Proccessing","https://en.wikipedia.org/wiki/Natural_language_processing");
                    aiList.add(new Topic("Machine Translation","https://en.wikipedia.org/wiki/Machine_translation");
                    aiList.add(new Topic("Speech Recogonition","https://en.wikipedia.org/wiki/Speech_recognition");
                    aiList.add(new Topic("Robotics","https://en.wikipedia.org/wiki/Robotics");
                    aiList.add(new Topic("Perception in Robotics","https://see.stanford.edu/materials/aiircs223a/handout5_robots_and_vision.pdf");

                    //// TODO: 28/1/17 MU

                    aiList.add(new Topic("Planning ","");
                    aiList.add(new Topic("Moving","");

                    return aiList;
                default:
                  return null;

            }

        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }
        if (subject.equals("pce") ){
            List<Topic> caList  = new ArrayList<>();
            //
            switch (unit){

                case "0":



                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
            return caList;
        }


        /*ENd OF ALl YEar*/

        return null;
    }


}
